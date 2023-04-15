/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author ddav_
 */
@Stateless
public class calcbean implements calcbeanLocal {

    @Override
    public Integer suma(int a, int b) {
        return (a+b);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Integer resta(int a, int b) {
        return (a-b);
    }

    @Override
    public Integer multiplicar(int a, int b) {
        return (a*b);
    }

    @Override
    public Integer division(int a, int b) {
        return (a/b);
    }

    @Override
    public Integer exponente(int a, int b) {
        
        return (int) Math.pow(a, b);
        
        }

    @Override
    public Integer modulo(int a, int b) {
        return (a%b);
    }
        
    
    
    
}
