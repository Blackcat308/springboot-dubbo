1.新建 zookeeper -data目录（文件夹）

2.复制示例配置文件为 zoo.cfg

3.修改dataDir指向目录为1新建目录

4.zkServer.sh start -- linux

5.zkServer.cmd -- windows

6.修改consumer、provider配置文件中 zookeeper地址。

7.依次启动 zook、提供者、消费者。