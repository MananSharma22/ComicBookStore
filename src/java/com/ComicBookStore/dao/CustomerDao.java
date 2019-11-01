package com.ComicBookStore.dao;
import com.ComicBookStore.modal.Customer;
import java.util.List;
public interface CustomerDao
{
   boolean addCustomer(Customer customer);
   boolean removeCustomer(Customer customer);
   boolean updateCustomer(Customer customer);
    List<Customer>getAllCustomers();
    
}
