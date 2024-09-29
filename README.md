在开发一个新的springboot项目的时候，引入mybatis怎么用都不行，提示Description:Field firstMapper in com.mysqltest.Controller.First required a bean of “xxx”，最后发现是我引入的库有问题，
如果直接引入的话，引入的是mybatis的核心库，需要配置后才能在springboot中使用，而引入的是继承了springboot的mybatis的话，就可以直接在springboot中使用。这又是一个小细节。（留意库的坐标）
