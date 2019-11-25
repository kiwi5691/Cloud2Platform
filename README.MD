#  CloudPlatform 

基于SpringCloud的微服务开发脚手架

# 简介
分布式框架目前有两个主流，Dubbo，SpringCloud。
SpringCloud的治理组件特别多。虽然Duboo也可以。但不像SpringCloud一样集成
所以这里重新搭载一下，因为我目前日常使用的是dubbo+zookeeper。所以默默的用SpringCloud搭载。
# 技术栈
名称 | 说明 | 
----|----|
JPA |因为数据库设计不会出现强关联的情况。所以用DDD设计|

# SpringCloud全家桶组件
名称 | 说明 | 
----|----|
Eureka | API 接口注册中心 |
Ribbon | 服务消费者调用服务生产者提供数据（服务的负载均衡调用）  | 
Feign | 注解使用 | 
Hystrix | 融断 | 
Config | 分布式配置中心组件 | 
Gateway | 服务网关 | 
Bus | 消息总线 | 
monitor  | 集成进vue前端 | 

# 环境
这里会有3个环境
dev，uat，prod
uat具体用来测试性能，也就是

# 进度
后面会加上各种组件，还有情况。希望能做成一个热拔插的脚手架，这几年慢慢完善

- MQ（没想好那个）
- Redis
- quartz

#####  模块

- oauth2（微信，qq，新浪）
- 权限
- 秒杀
- 网关操作
- mq监控
- 定时任务监控
