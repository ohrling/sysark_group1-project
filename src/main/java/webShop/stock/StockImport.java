package webShop.stock;

import webShop.article.Article;
import java.util.List;

public interface StockImport {
    List<Article> getStock(); // Get the stock for implementing class from db
}
