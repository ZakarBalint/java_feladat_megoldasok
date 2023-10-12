package osztalypeldanyositas;

class Aircraft
{
    String type;
    int maxAmmo;
    int baseDamage;
    int ammo;

    public int fight()
    {
        ammo = 0;
        return ammo * baseDamage;
    }

    public void refillAmmo(int amount)
    {
        if(amount > maxAmmo)
        {
            amount = maxAmmo;
        }

        ammo = amount - ammo;
    }

    public String getType()
    {
        return type;
    }

    public String getStatus()
    {
        return "Type " + type + ", Ammo: " + ammo + ", Base Damage: " + baseDamage + ", All Damage: " + ammo * baseDamage;
    }

    public boolean  isPriority()
    {
        if(type == "F35")
        {
            return true;
        }
        else if(type == "F16")
        {
            return false;
        }

        return false;
    }
}

public class Aircrafts {
    public static void main(String[] args) {
        
    }    
}
