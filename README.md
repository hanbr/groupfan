# 群范儿接口文档


## API
请求URL： 

baseUrl = "/groupfan/api";

统一返回接口说明：

成功返回

```json
{"code":200,"message":"SUCCESS","data":null}
```

失败返回错误信息

## 商品相关接口
 
### 首页 -商品列表

展示当前用户所在群组下关联的所有商品列表分页，每页显示5条，下拉刷新下一页

```GET: [baseUrl]/goods```
|参数|含义|
|----|----|
|pageNum|当前页面，默认1|
|pageSize|每页条数，默认5|

**返回**

```json
{
    "code":200,
    "message":"SUCCESS",
    "data":[
        {
            "goodsId":2,
            "goodsName":"男士皮鞋韩版系带潮鞋休闲鞋冬季男鞋加绒保暖英伦百搭鞋子内增高",
            "goodsKind":"[{\"kindName\":\"40\",\"price\":119,\"count\":100},{\"kindName\":\"41\",\"price\":119,\"count\":100}]",
            "price":"119.0-129.0",
            "releaseDate":"2017-12-19 08:43:42",
            "userId":1,
            "address":"北京市 海淀区",
            "goodsDesc":"品牌名称：XUSBEAN/旭宾",
            "photoList":[
                {
                    "photoId":4,
                    "photoUrl":"http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.522ed06ea51c467d934e9715a32222c2.jpg"
                },
                {
                    "photoId":5,
                    "photoUrl":"http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.f160005d5e35ab751f5a9e87c0b54207.jpg"
                }
            ],
            "cover":"商品封面路径",
            "userName":"用户名",
            "userHead":"头像路径"
        }
    ]
}
```
***实际返回字段可能较多，自行刷选可用字段。***

### 商品发布
```POST: [baseUrl]/goods```

请求JSON格式

```json
{
    "goodsKind":[
        {
            "kindName":"0.9*2.0cm",
            "price":39,
            "count":100
        },
        {
            "kindName":"1.0*2.0cm",
            "price":49,
            "count":100
        }
    ],
    "imgs":[
        "http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.87f9940c978c375f355e1fa6e2e329f8.jpg",
        "http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.539e5d3030f6240614209e34cc6ac8bb.jpg",
        "http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.1834c13a5e577605411e87feaf95bcdc.jpg"
    ],
    "address":"北京市 海淀区",
    "checkboxItems":[
        {
            "name":"全新宝贝",
            "value":"1"
        }
    ],
    "user_id":1,
    "goodsName":"商品名称",
    "goodsDesc":"商品详情"
}
```
**返回**
```json
{"code":200,"message":"SUCCESS","data":null}
```

###商品详情###
```GET:[baseUrl]/goods/{id}```

```返回```
```json
{
    "code":200,
    "message":"SUCCESS",
    "data":{
        "goodsId":1,
        "goodsName":"法兰绒 褥子 床垫",
        "goodsKind":"[{\"kindName\":\"0.9*2.0cm\",\"price\":39,\"count\":100},{\"kindName\":\"1.0*2.0cm\",\"price\":49,\"count\":100}]",
        "price":"39-49",
        "isRelease":"1",
        "releaseDate":"2017-12-19 06:21:29",
        "freight":null,
        "userId":1,
        "address":"北京市 海淀区",
        "status":"1",
        "createdDate":"2017-12-19 06:21:29",
        "updatedDate":"2017-12-19 06:21:29",
        "goodsDesc":"法兰绒床褥子垫背床铺垫子薄款铺床被垫褥1.5米1.8m珊瑚绒床垫1.2】[厂家直营]：买退无忧 商家承诺：免费提供“运费险”，退货最高获赔25元运费理赔",
        "photoList":[
            {
               "photoId":4,
               "photoUrl":"http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.522ed06ea51c467d934e9715a32222c2.jpg"
            },
            {
              "photoId":5,
              "photoUrl":"http://tmp/wx45bb9246d381708c.o6zAJs4BatHFHZvAeSGfSXYl3L7Q.522ed06ea51c467d934e9715a32222c2.jpg"
             }
        ],
        "kindList":[
            {
                "kindName":"0.9*2.0cm",
                "count":100,
                "price":39
            },
            {
                "kindName":"1.0*2.0cm",
                "count":100,
                "price":49
            }
        ],
        "userName":"用户名称",
        "userHead":"用户头像路径"
    }
}
```


