package com.example.storedetaildemo.bean;

import java.util.List;

public class DetailProductBean {

    /**
     * total : 24
     * products : [{"id":0,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":0,"sort_group_name":"热销","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":false,"image":"product_100_01"},{"id":1,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":0,"sort_group_name":"热销","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":true,"image":"product_100_02"},{"id":2,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":0,"sort_group_name":"热销","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_03"},{"id":3,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":1,"sort_group_name":"必点","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":true,"image":"product_100_01"},{"id":4,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":1,"sort_group_name":"必点","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":false,"image":"product_100_03"},{"id":5,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":1,"sort_group_name":"必点","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":true,"image":"product_100_01"},{"id":6,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":2,"sort_group_name":"进店必买","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":false,"image":"product_100_01"},{"id":7,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":2,"sort_group_name":"进店必买","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_02"},{"id":8,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":2,"sort_group_name":"进店必买","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":9,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":3,"sort_group_name":"肉馅馄炖","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":true,"image":"product_100_02"},{"id":10,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":3,"sort_group_name":"肉馅馄炖","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":11,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":3,"sort_group_name":"肉馅馄炖","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":false,"image":"product_100_03"},{"id":12,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":4,"sort_group_name":"素馅馄炖","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_01"},{"id":13,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":4,"sort_group_name":"素馅馄炖","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":14,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":4,"sort_group_name":"素馅馄炖","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":15,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":5,"sort_group_name":"浓情馄炖","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_02"},{"id":16,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":5,"sort_group_name":"浓情馄炖","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_02"},{"id":17,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":5,"sort_group_name":"浓情馄炖","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":true,"image":"product_100_02"},{"id":18,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":6,"sort_group_name":"小菜","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":false,"image":"product_100_03"},{"id":19,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":6,"sort_group_name":"小菜","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":20,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":6,"sort_group_name":"小菜","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":true,"image":"product_100_02"},{"id":21,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":7,"sort_group_name":"饮品","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":22,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":7,"sort_group_name":"饮品","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":23,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":7,"sort_group_name":"饮品","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":24,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":8,"sort_group_name":"江湖川菜","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":25,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":8,"sort_group_name":"江湖川菜","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":26,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":8,"sort_group_name":"江湖川菜","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":27,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":9,"sort_group_name":"吃肉荤菜","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":28,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":9,"sort_group_name":"吃肉荤菜","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":29,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":9,"sort_group_name":"吃肉荤菜","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":30,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":10,"sort_group_name":"田园时蔬","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":31,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":10,"sort_group_name":"田园时蔬","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":32,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":10,"sort_group_name":"田园时蔬","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":33,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":11,"sort_group_name":"特色干锅","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":34,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":11,"sort_group_name":"特色干锅","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":35,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":11,"sort_group_name":"特色干锅","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":36,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":12,"sort_group_name":"优选套餐","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":37,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":12,"sort_group_name":"优选套餐","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":38,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":12,"sort_group_name":"优选套餐","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":39,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":13,"sort_group_name":"美味小吃","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":40,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":13,"sort_group_name":"美味小吃","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":41,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":13,"sort_group_name":"美味小吃","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":42,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":14,"sort_group_name":"营养汤羹","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":43,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":14,"sort_group_name":"营养汤羹","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":44,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":14,"sort_group_name":"营养汤羹","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":45,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":15,"sort_group_name":"主食米饭","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":46,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":15,"sort_group_name":"主食米饭","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":47,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":15,"sort_group_name":"主食米饭","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":48,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":16,"sort_group_name":"饭后水果","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":49,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":16,"sort_group_name":"饭后水果","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":50,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":16,"sort_group_name":"饭后水果","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":51,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":17,"sort_group_name":"开元小抄","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":52,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":17,"sort_group_name":"开元小抄","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":53,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":17,"sort_group_name":"开元小抄","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":54,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":18,"sort_group_name":"招牌套餐","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":55,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":18,"sort_group_name":"招牌套餐","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":56,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":18,"sort_group_name":"招牌套餐","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":57,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":19,"sort_group_name":"聚餐家宴","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":58,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":19,"sort_group_name":"聚餐家宴","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":59,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":19,"sort_group_name":"聚餐家宴","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":60,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":20,"sort_group_name":"开元热销","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":61,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":20,"sort_group_name":"开元热销","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":62,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":20,"sort_group_name":"开元热销","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":63,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":21,"sort_group_name":"一人大菜","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":64,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":21,"sort_group_name":"一人大菜","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":65,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":21,"sort_group_name":"一人大菜","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":66,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":22,"sort_group_name":"冰凉甜品","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":67,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":22,"sort_group_name":"冰凉甜品","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":68,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":22,"sort_group_name":"冰凉甜品","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":69,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":23,"sort_group_name":"铁板炒饭","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":70,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":23,"sort_group_name":"铁板炒饭","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":71,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":23,"sort_group_name":"铁板炒饭","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"},{"id":72,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":24,"sort_group_name":"大碗汤面","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_01"},{"id":73,"title":"老上海一口鲜小馄饨","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":24,"sort_group_name":"大碗汤面","sort_group_describe":"广大食客之选","is_specification":false,"is_discount":false,"image":"product_100_03"},{"id":74,"title":"鲜虾鸡肉紫菜鸡蛋鲜汤大份","describe":"每日现包，鲜肉小馄炖","quantity":109,"price":1250,"original_price":2200,"discount_str":"已优惠8.5折","sort_group_id":24,"sort_group_name":"大碗汤面","sort_group_describe":"广大食客之选","is_specification":true,"is_discount":true,"image":"product_100_02"}]
     */

    private int total;
    private List<ProductsBean> products;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ProductsBean> getProducts() {
        return products;
    }

    public void setProducts(List<ProductsBean> products) {
        this.products = products;
    }

    public static class ProductsBean {
        /**
         * id : 0
         * title : 老上海一口鲜小馄饨
         * describe : 每日现包，鲜肉小馄炖
         * quantity : 109
         * price : 1250
         * original_price : 2200
         * discount_str : 已优惠8.5折
         * sort_group_id : 0
         * sort_group_name : 热销
         * sort_group_describe : 广大食客之选
         * is_specification : true
         * is_discount : false
         * image : product_100_01
         */

        private int id;
        private String title;
        private String describe;
        private int quantity;
        private int price;
        private int original_price;
        private String discount_str;
        private int sort_group_id;
        private String sort_group_name;
        private String sort_group_describe;
        private boolean is_specification;
        private boolean is_discount;
        private String image;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getOriginal_price() {
            return original_price;
        }

        public void setOriginal_price(int original_price) {
            this.original_price = original_price;
        }

        public String getDiscount_str() {
            return discount_str;
        }

        public void setDiscount_str(String discount_str) {
            this.discount_str = discount_str;
        }

        public int getSort_group_id() {
            return sort_group_id;
        }

        public void setSort_group_id(int sort_group_id) {
            this.sort_group_id = sort_group_id;
        }

        public String getSort_group_name() {
            return sort_group_name;
        }

        public void setSort_group_name(String sort_group_name) {
            this.sort_group_name = sort_group_name;
        }

        public String getSort_group_describe() {
            return sort_group_describe;
        }

        public void setSort_group_describe(String sort_group_describe) {
            this.sort_group_describe = sort_group_describe;
        }

        public boolean isIs_specification() {
            return is_specification;
        }

        public void setIs_specification(boolean is_specification) {
            this.is_specification = is_specification;
        }

        public boolean isIs_discount() {
            return is_discount;
        }

        public void setIs_discount(boolean is_discount) {
            this.is_discount = is_discount;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }
}