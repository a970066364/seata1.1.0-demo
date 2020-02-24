package app.itw.cloud.seata.client;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述: author: Tsion date: 2020-02-24
 */

@FeignClient(name = "storage-service")
public interface StorageTblClient {

  /**
   * 减库存
   *
   * @param num 数量
   */
  @RequestMapping(value = "api/v1/storage/deduct", method = RequestMethod.GET)
  public String deduct(@RequestParam("num") Integer num);
}
