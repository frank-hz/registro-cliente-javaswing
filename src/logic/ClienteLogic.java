/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import classes.Cliente;
import java.util.ArrayList;

public class ClienteLogic {
    public static ArrayList<Cliente> DataList = new ArrayList<Cliente>();
    
    public ArrayList<Cliente> getList(){
        return DataList;
    }
    
    public Cliente get(String id){
        for (Cliente cliente: DataList){
            if (cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }
    
    public void create(Cliente cliente){
        DataList.add(cliente);
    }
    
    public boolean delete(String id){
        int index = 0;
        for (Cliente cliente: DataList){
            if (cliente.getId() == id){
                DataList.remove(index);
                return true;
            }
        }        
        return false;
    }
    
    public boolean update(Cliente clienteUpd){
        for (Cliente cliente: DataList){
            if (cliente.getId() == clienteUpd.getId()){
                cliente.setName(clienteUpd.getName());
                cliente.setPhone(clienteUpd.getPhone());
                cliente.setGender(clienteUpd.getGender());
                cliente.setCountry(clienteUpd.getCountry());
                return true;
            }
        }        
        return false;
    }
    
    
    public int getSize(Cliente clienteUpd){      
        return DataList.size();
    }
     public boolean exists(String id){
        for (Cliente cliente: DataList){
            if (cliente.getId() == id){
                return true;
            }
        }
        return false;
    }
    
     
}
