/*
 * Caleb May
 * Mr. Eng
 * AT Java
 */

/*
 * The output would be 0 | 0 because in setValue you are setting the value equal to the instance variable rather 
 * than the variable for the class so when you getValue the value you are getting has not changed.
 * To get 0 | 13 you would change  
 * public void setValue(int value) {
       value = value;
    to
     public void setValue(int value) {
       this.value = value;
 */