## ImageNet Classification with Deep Convolutional Neural Networks
### Abstract
#### 训练的该神经网络特点
-  基本结构：The neural network, which has 60 million parameters and 650,000 neurons, consists of five convolutional layers, some of which are followed by max-pooling layers, and three fully-connected layers with a final 1000-way softmax.
-  优化：
  -  加快训练速度：used non-saturating neurons and a very efficient GPU implemen-tation of the convolution operation
  -  减少过拟合：employed a recently-developed regularization method called “dropout”

### Introduction
#### CNNs优势
-  为提高准确率，应该使用较大的数据集，同时应该有大量的先验知识来补偿所没有的数据。
-  控制容量：Their capacity can be con-trolled by varying their depth and breadth, and they also make strong and mostly correct assumptions about the nature of images (namely, stationarity of statistics and locality of pixel dependencies). 
-  容易训练（参数较少），准确率高：compared to standard feedforward neural networks with similarly-sized layers, CNNs have much fewer connections and parameters and so they are easier to train, while their theoretically-best performance is likely to be only slightly worse.
#### CNNs改进
- 大规模应用于高分辨率图像成本较高
- 解决方法：GPU和高度优化的2D卷积结合

### The Architecture
#### ReLU Nonlinearity
-  具有ReLU的网络学习速度总是比饱和神经元快几倍
-  : A four-layer convolutional neural network with ReLUs (solid line) reaches a 25% training error rate on CIFAR-10 six times faster than an equivalent network with tanh neurons (dashed line).
- ![figure 1](F:\StudyNotes\machine-learning\photo\Paper\1.png)

#### Training on Multiple GPUs
-  GPUs并行化：hey are able to read from and write to one another’s memory directly, without going through host machine memory.
-  并行化方案：we employ essentially puts half of the kernels (or neurons) on each GPU, with one additional trick: the GPUs communicate only in certain layers. This means that, for example, the kernels of layer 3 take input from all kernel maps in layer 2。

#### Local Response Normalization（标准化）
-  局部归一化有助于泛化

#### Overlapping Pooling（重叠合并）
-  通过池化来降低卷积层输出的特征向量，同时改善结果（不易出现过拟合）。
-  设置s
  -  s=z:obtain traditional local pooling as commonly employed in CNNs.
  -  s<z:obtain overlapping pooling

#### Overall Architecture（总体架构）
-  结构
  -  the net contains eight layers with weights; the first five are convolutional and the remaining three are fully-connected.
  -  The output of the last fully-connected layer is fed to a 1000-way softmax which produces a distribution over the 1000 class labels
-  ![figure 2](F:\StudyNotes\machine-learning\photo\Paper\2.png)
-  两个GPU之间的划分：One GPU runs the layer-parts at the top of the figure while the other runs the layer-parts at the bottom. The GPUs communicate only at certain layers.

### Reducing Overfitting
#### 方法一：Data Augmentation
-  减少图像数据过度拟合的最常见方法：使用保留标签的转换，人为放大数据集
-  两种数据增强转换方式（转换后的图像不需要存储在磁盘上）
  -  generating image translations and horizontal reflec-tions.
  -  altering the intensities of the RGB channels in training images

#### 方法二：Dropout
-  方法：consists of setting to zero the output of each hidden neuron with probability 0.5. The neurons which are “dropped out” in this way do not contribute to the forward pass and do not participate in back-propagation
- 每次输入一个输入，神经网络就会有一个不同的架构
-  这些架构都有权重，减少了神经元的相互适应性

### Qualitative Evaluations
-  两个GPU所显示的专门化：
  -  The kernels on GPU 1 are largely color-agnostic
  -  the kernels on on GPU 2 are largely color-specific.
- This kind of specialization occurs during every run and is independent of any particular random weight initialization (modulo a renumbering of the GPUs).

### Discussion
-  results show that a large, deep convolutional neural network is capable of achieving record-breaking results on a highly challenging dataset using purely supervised learning.
- our network’s performance degrades if a single convolutional layer is removed.
