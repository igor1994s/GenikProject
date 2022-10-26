package com.example.genikmarket.controller;

import com.example.genikmarket.model.Product;
import com.example.genikmarket.service.ProductService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/all")
    public ModelAndView getAll(ModelAndView modelAndView){
        List<Product> products = productService.findAll();
        modelAndView.addObject("products",products);
        modelAndView.setViewName("homePage/catalog");
        return modelAndView;
    }

    @PostMapping("/add")
    public ModelAndView addProduct(@ModelAttribute Product product, ModelAndView modelAndView) {
        productService.save(product);
        modelAndView.setViewName("redirect:/product/all");
        return modelAndView;
    }
    @GetMapping("/add")
    public ModelAndView getAddPage(@ModelAttribute ModelAndView modelAndView){
        modelAndView.setViewName("addProductPage");
        return modelAndView;
    }
    @GetMapping("/{id}")
    public ModelAndView getProduct(@PathVariable("id") Long id,@ModelAttribute ModelAndView modelAndView){
        modelAndView.addObject(productService.findById(id));
        modelAndView.setViewName("product");
        return modelAndView;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView deleteProduct(@PathVariable("id") Long id,@ModelAttribute ModelAndView modelAndView){
        Product product=productService.findById(id);
        productService.delete(product);
        modelAndView.setViewName("redirect:/product/all");
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public ModelAndView getEditPage(@PathVariable("id") Long id,@ModelAttribute ModelAndView modelAndView){
        Product product=productService.findById(id);
        modelAndView.addObject("product", product);
        modelAndView.setViewName("editProductPage");
        return modelAndView;
    }
    @PostMapping("/edit")
    public ModelAndView editProduct(ModelAndView modelAndView, @ModelAttribute Product product){
        productService.update(product);
        modelAndView.setViewName("redirect:/product/all");
        return modelAndView;
    }

    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("product",new Product());
    }
}
