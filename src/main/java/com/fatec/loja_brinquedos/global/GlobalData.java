package com.fatec.loja_brinquedos.global;

import java.util.List;
import java.util.ArrayList;
import com.fatec.loja_brinquedos.model.Product;

public class GlobalData {
    public static List<Product> cart;

    static {
        cart = new ArrayList<>();
    }
}
