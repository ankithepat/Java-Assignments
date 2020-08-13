package com.app;
public class Calculator{
        private Double num1=0.00;
        private Double num2=0.00;
        public Double get1()
        {
            return num1;
        }
        public Double get2()
        {
            return num2;
        }
        public void set1(Double a)
        {
            this.num1=a;
        }
        public void set2(Double a)
        {
            this.num2=a;
        }
        public Double add()
        {
            return num1+num2;
            
        }
        public Double sub()
        {
            if(num1>num2)
            {
                return num1-num2;
            }
            else
            return num2-num1;
        }
        public Double mul()
        {
            return num1*num2;
        }
        public Double div()
        {
            if(num2==0)
                return 0.00;
            return num1/num2;
        }
        
     }