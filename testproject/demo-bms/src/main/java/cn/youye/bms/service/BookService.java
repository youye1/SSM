package cn.youye.bms.service;

import cn.youye.bms.dao.BookDao;
import cn.youye.bms.entity.Book;
import com.alibaba.fastjson.JSONObject;
import org.mortbay.util.ajax.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by pc on 2016/7/22.
 */
@Service
@RequestMapping("/book")
public class BookService {

    @Autowired
    private BookDao bookDao;

    @RequestMapping("/save")
    public String save() {
        List<Book> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            Book book = new Book();
            book.setId(UUID.randomUUID().toString());
            book.setName("撒哈拉的故事");
            book.setAuthor("三毛");
            book.setPublish("北京十月文艺出版社");
            book.setIsbn("2008090909");
            book.setPrice(22.56);
            list.add(book);
        }
        return JSONObject.toJSONString(list);
    }
}
