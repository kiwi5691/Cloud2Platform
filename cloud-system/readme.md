注册中心，使用nacos

- 由3个角色组成
1.Register Server  提供服务注册和发现的Server
2、Service Provider 服务提供方  将自身服务注册到注册中心，从而使服务消费方能够找到
3、Service Consumer：服务消费方   从注册中心中获取注册服务列表，从而能够消费服务

- 配置

http://host:8848
搭载在了服务器上面。后期全部用docker-compose或者k8s来自动化操作