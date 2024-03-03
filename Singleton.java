// Implementation of a Singleton pattern using private constructors.
class Singleton
{
static Singleton instance = null;
public int y = 48;
// private constructor can not be accessed outside the class
private Singleton() { }
// Factory method to provide the users with instances
static public Singleton getInstance()
{
if (instance == null)		
instance = new Singleton();
return instance;
}
}