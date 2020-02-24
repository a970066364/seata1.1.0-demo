package app.itw.cloud.seata.order.controller;


import app.itw.cloud.seata.order.entity.OrderTbl;
import app.itw.cloud.seata.order.service.OrderTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {

  @Autowired
  private OrderTblService orderTblService;

  @GetMapping("test")
  public String test(Integer num) {
    System.out.println("正在提交订单,购买数量"+num);
    OrderTbl orderTbl = new OrderTbl();
    //购买数量，库存服务剩余库存量为偶数则抛出异常，模拟全局回滚
    orderTbl.setCount(num);//本次购买数量
    orderTbl.setCommodityCode("10001");//默认商品编号
    orderTbl.setMoney(100*num);//模拟所花的钱。单价100
    orderTbl.setUserId("1000");//设置用户id
    return orderTblService.generateOrder(orderTbl);
  }
}
