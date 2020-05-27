package kr.re.kitri.hello.controller;

import kr.re.kitri.hello.model.Product;
import kr.re.kitri.hello.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    /*
    Controller는 반드시 Service가 Autowired 되어있어야 한다.
    안그러면 뭔가가 잘못된것.
    */
    @Autowired private ProductService productService;

    @GetMapping("/products/{productId}")
    public Map<String, Object> getProductDetailsByProductId(@PathVariable int productId){
        System.out.println(productId);
        Product p =  productService.viewProductDetail(productId);
        Map<String,Object> result = new HashMap<>() ;
        result.put("status","OK");
        result.put("data",p);
        return result;
    }

    @GetMapping("/products")
    public String getProducts(){
        //1.요청해석..

        //5. 결과값을 받아서 JSON 포맷을 만들어서 전송(응답)
        // 해당되는 기능을 가진 서비스 함수를 호출하는 것..

        //return "모든 상품목록 입니다.";
        //return new ProductService().retrieveProducts();
        return productService.retrieveProducts();
    }

    @GetMapping("/products/hello")
    public String hello(){
        //1.요청해석..
        return "hello";
    }
}
