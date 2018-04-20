package Example1;

abstract  class Training {

    abstract void morning();
    abstract void afternoon();
    abstract void night();

    //template methode
    public void train(){
        morning();
        afternoon();
        night();
    }
}
