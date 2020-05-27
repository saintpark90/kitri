package kr.re.kitri.hello.dao;

import kr.re.kitri.hello.model.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    public String selectProducts(){
        // DB 접속... 쿼리 날림
        // Mybatis..
        // ...

        return "상품 목록을 출력합니다.";
    }

    public Product selectProductById(int i) {
        //디비에서 조회
        Product p = new Product(i+"","아이폰11",500000,"iphone");
        return p;
    }
}
