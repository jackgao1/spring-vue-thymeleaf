# docker开启2375端口提供外部访问
一、编辑docker文件：/usr/lib/systemd/system/docker.service
    命令：vim /usr/lib/systemd/system/docker.service
    修改ExecStart行，增加内容 -H tcp://0.0.0.0:2375 ，修改后如下：
    ExecStart=/usr/bin/dockerd -H tcp://0.0.0.0:2375 -H fd:// --containerd=/run/containerd/containerd.sock
二、重新加载docker配置
    systemctl daemon-reload // 1，加载docker守护线程
    systemctl restart docker // 2，重启docker