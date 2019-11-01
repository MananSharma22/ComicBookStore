
package com.ComicBookStore.modal;

public class Products 
{
private String ProductName;
private String ProductCategory;
private Double ProductId;
private String ProductPrice;
private Double ImagePath;

    public Double getImagePath() {
        return ImagePath;
    }

    public void setImagePath(Double ImagePath) {
        this.ImagePath = ImagePath;
    }

 
    public String getProductPrice() {
        return ProductPrice;
    }

    public Double getProductId() {
        return ProductId;
    }

    public void setProductId(Double ProductId) {
        this.ProductId = ProductId;
    }

    public void setProductPrice(String ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductCategory() {
        return ProductCategory;
    }

    public void setProductCategory(String ProductCategory) {
        this.ProductCategory = ProductCategory;
    }

   
    
}
