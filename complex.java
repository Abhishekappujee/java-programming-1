import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Complex {
    int real, imaginary;
    Complex() {}
    
    Complex(int tempReal, int tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }
    
    //addition
    
    Complex addComp(Complex C1, Complex C2){
        Complex temp = new Complex();
        temp.real = C1.real + C2.real;
        temp.imaginary = C1.imaginary + C2.imaginary;
        return temp;
    }
    
    // Subtraction
    
    Complex subtractComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = C1.real - C2.real;
         temp.imaginary = (C1.imaginary - C2.imaginary);
         return temp;
    }
    // Product
    Complex multiplicationComp(Complex C1, Complex C2)
    {
        Complex temp = new Complex();
        temp.real = C1.real * C2.real;
        temp.imaginary = (C1.imaginary * C2.imaginary);
        return temp;
    }
    
}

// Main class
 class MainPart{
     public static void main(String args[])
     {
         
         int a,b,c,d;
        
         BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
         
         System.out.println("Please Enter the value of both complex No");
         try{

         a = reader.read();
         b = reader.read();
         c = reader.read();
         d = reader.read();

        }catch (Exception e){

            System.out.println("An error occurred "+  e);

            return;

        }
       
         Complex C1 = new Complex(a, b);
         Complex C2 = new Complex(c, d);
         
         System.out.println("Complex number 1 : "+ C1.real + " + i"+ C1.imaginary);
         System.out.println("Complex number 2 : "+ C2.real + " + i"+ C2.imaginary);
         
         Complex C3 = new Complex();
         C3 = C3.addComp(C1, C2);
         System.out.println("Addition of complex number : "+ C3.real + " + i"+ C3.imaginary);
         C3 = C3.subtractComp(C1, C2);
         System.out.println("Subtraction of complex number : ("+ C3.real + ") - i("+ C3.imaginary+")");
         C3 = C3.multiplicationComp(C1, C2);
         System.out.println("Multiplication of complex number : ("+ C3.real + ") * i("+ C3.imaginary+")");
         
     }
 }




    
    
    
    
    
    
    
    
    
    
    
    
    
    
    