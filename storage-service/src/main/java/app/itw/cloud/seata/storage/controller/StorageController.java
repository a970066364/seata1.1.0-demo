package app.itw.cloud.seata.storage.controller;


import app.itw.cloud.seata.storage.entity.StorageTbl;
import app.itw.cloud.seata.storage.service.StorageTblService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("api/v1/storage")
@RestController
public class StorageController {


  @Autowired
  private StorageTblService storageTblService;

  @GetMapping("deduct")
  public Object deduct(Integer num) {
    System.out.println("storage 正在减去库存" + num);
    StorageTbl storageTbl = storageTblService.getById(1);
    storageTbl.setCount(storageTbl.getCount() - num);
    storageTblService.update(storageTbl);
    return storageTbl;
  }
}
