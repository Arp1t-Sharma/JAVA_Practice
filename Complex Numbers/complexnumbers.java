class complexnumbers{
    
    int real, image;

    public complexnumbers(int r, int i){
        this.real = r;
        this.image = i;
    }

    public void showC()
    {
        System.out.println(this.real + " +i " + this.image );
    }

    public static complexnumbers add(complexnumbers n1, complexnumbers n2){

        complexnumbers res = new complexnumbers(0,0);
        
        res.real = n1.real + n2.real;
        res.image = n1.image + n2.image;

        return res;
    }

    public static void main(String[]args){
        complexnumbers c1 = new complexnumbers(4,5);
        complexnumbers c2 = new complexnumbers(10,5); 

        System.out.println("first complex number:");
        c1.showC();

        System.out.println("Second complex numbers:");
        c2.showC();

        complexnumbers res = add(c1,c2);

        System.out.println("\nAddition is:");
        res.showC();
    }
}