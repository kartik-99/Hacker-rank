class Add{
    public void add(int... a){
        boolean flag = true;
        int sum = 0;
        for(int i:a){
            sum+=i;
            if(flag){
                flag = false;
                System.out.print(i);
            }else System.out.print("+"+i);
        }
        System.out.println("="+sum);
    }
}
