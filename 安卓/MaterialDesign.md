# MaterailDesign
## ToolBar
- 基本用法:不仅继承了ActionBar的所有功能，而且灵活性很高，配合其它控件完成MaterialDesign的效果
```java
Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
setSupportActionBar(toolbar);       //既使用了toolbar，也让其外观和功能和actionbar相同
```
## 滑动菜单
### DrawerLayout
- 基本用法：首先它是一个布局，在布局中允许放入两个直接控件
  1. 第一个子控件：主屏幕显示的内容
  2. 滑动菜单中显示的内容
- 直接在布局中写代码，在MainActivity中应用
- 最左边加入导航图标，点击实现侧滑菜单
```java
ActionBar actionBar=getSupportActionBar();          //获取actionbar实例
if (actionBar!=null){
    actionBar.setDisplayHomeAsUpEnabled(true);      //显示导航按钮
    actionBar.setHomeAsUpIndicator(R.mipmap.ic_menu);     //导航按钮图标
    }
...

public boolean onOptionsItemSelected(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case android.R.id.home:
                    mDrawerLayout.openDrawer(GravityCompat.START);//将滑动菜单显示出来
                    break;
            ...
}
```

### NavigationView
- 基本用法:在侧滑菜单中定义任意的布局，一般包括以下两个子布局
  1. 下面的内容布局menu
  2. 上面的头部布局headerLayout
- 效果显示

### 悬浮按钮和可交互提示
- FloatingActionBar：轻松实现悬浮按钮的效果
- SnackBar
    基本用法：实现和用户的交互功能
    - SnackBar不是toast的替代品：Toas用于告诉用户发生的事情，用户不能改变该事情；
    - snackBar进行了扩展，加入可交互操作；当用户在点击的时候，执行一些额外的逻辑操作
```java
Snackbar.make(view,"Data deleted",Snackbar.LENGTH_INDEFINITE)
              .setAction("Undo",new  View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        Toast.makeText(MainActivity.this,"Data restored",Toast.LENGTH_SHORT).show();
                    }
                }).show();
```    

### CoordinatorLayout
- 基本用法：是一个加强版的FrameLayout；可以监听所有子控件的各种事件，自动帮我们做出最为合理的响应
- 子控件：FloatingBar

## 卡片式布局
### CardView
- 基本用法：CardView也是一个FrameLayout，只是额外提供了圆角和阴影等效果
### AppBarLayout
- 基本用法
  - 防止出现FrameLayout遮挡ToolBar；因为FrameLayout中所有的控件在不进行明确定位的情况下，默认都会摆放在布局的左上角
  - AppBarLayout是一个垂直方向的LinearLayout，在内部做了很多事件的封装

## 下拉刷新
- SwipeRefreshLayout用于实现下拉刷新功能的核心类
- 基本用法
```java
swipeRefresh=(SwipeRefreshLayout) findViewById(R.id.swipe_refresh);
        swipeRefresh.setColorSchemeResources(R.color.colorPrimary);
        swipeRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener(){
            @Override
            public void onRefresh(){
                refreshFruits();
            }
        });


private void refreshFruits() {
    new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            runOnUiThread(new Runnable() {  //切换到主线程
                @Override
                public void run() {
                    initFruits();           //init重新生成数据
                    adapter.notifyDataSetChanged();     //通知数据发生了变化
                    swipeRefresh.setRefreshing(false);    //表示刷新事件结束，并隐藏刷新进度条
                }
            });
        }
    }).start();
    }
```
## 可折叠式标题栏
### CollapsingToolbarLayout
- 基本用法：不能独立存在，被限定只能作为AppBarLayout的直接子布局来使用
```java
CollapsingToolbarLayout collapsingToolbar=(CollapsingToolbarLayout) findViewById(R.id.collapsingBar);

        //填充界面上的内容
        collapsingToolbar.setTitle(fruitName);
        Glide.with(this).load(fruitImageId).into(fruitImageView);

        String fruitContent = generateFruitContent(fruitName);
        fruitContentText.setText(fruitContent);

.......

//recycler的点击事件

final ViewHolder holder= new ViewHolder(view);
holder.cardView.setOnClickListener(new View.OnClickListener(){
    @Override
    public void onClick(View v) {
        int position = holder.getAdapterPosition();
        Fruit fruit=mFruitList.get(position);
        Intent intent=new Intent(mContext,FruitActivity.class);
        //通过键值对进行传递。用全局变量传递，在FruitActivity获取内容
        intent.putExtra(FruitActivity.FRUIT_NAME,fruit.getName());
        intent.putExtra(FruitActivity.FRUIT_IMAGE_ID,fruit.getImageId());
        mContext.startActivity(intent);
    }
});

return holder;

```

### 充分利用系统状态栏空间
- 实现功能：让背景图和系统状态栏融合，借用Androidstudio:fitsSystemWindows属性设置
