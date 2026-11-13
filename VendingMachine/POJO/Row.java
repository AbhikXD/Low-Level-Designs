package POJO;

public class Row {
    private int totalRowCount;
    private Product rowProduct;
    private int filledRowCount;

    public Row(int rowCount){
        this.totalRowCount = rowCount;
        rowProduct = null;
        filledRowCount = 0;
    }

    public boolean checkAvailability(){
        if(totalRowCount == filledRowCount){
            return false;
        }
        return true;
    }

    public boolean insertProduct(Product product,int productCount)
    {
        if(!checkAvailability() || productCount>(totalRowCount - filledRowCount) ||  rowProduct != null){
            return false;
        }
        rowProduct = product;
        filledRowCount += productCount;
        System.out.println("<Row> The product is inserted in Row . . . ");
        return true;
    }
    public boolean removeProduct(int removeCount){
            if(filledRowCount > removeCount){
                filledRowCount -=removeCount;
                System.out.println("<Row> The product is removed from the Row . . . ");
                return true;
            }
        return false;
    }
    

    public Product getProduct(){
        return rowProduct;
    }

    
    
}
