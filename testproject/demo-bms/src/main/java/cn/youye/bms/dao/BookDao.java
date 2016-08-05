package cn.youye.bms.dao;

import cn.youye.bms.entity.Book;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by pc on 2016/7/22.
 */
@Repository()
public interface BookDao extends PagingAndSortingRepository<Book,String> {

}
