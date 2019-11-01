
package com.ComicBookStore.dao;

import com.ComicBookStore.modal.Products;
import java.util.List;

public interface CategoryDao {
    List<Products> showComics();
    List <Products> showPosters();
    List<Products> showTshirts();;
}
