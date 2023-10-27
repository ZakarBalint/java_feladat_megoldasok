package AircraftAndCarrier;

public class Carrier {

    Aircraft[] Aircrafts;
    int ammo;
    int hp;

    public Carrier(int _ammo, int _hp)
    {
        this.ammo = _ammo;
        this.hp = _hp;
        this.Aircrafts = null;
    }

    public void add_aircraft(Aircraft _Aircraft)
    {
        this.Aircrafts[this.Aircrafts.length + 1] = _Aircraft;
    }

    public void fill_aircrafts()
    {
        if(this.get_requiredAmmoToFill() <= this.ammo)
        {
            for (int i = 0; i < this.Aircrafts.length; i++) 
            {
                this.ammo -= this.Aircrafts[i].maxAmmo - this.Aircrafts[i].ammo;

                this.Aircrafts[i].refillAmmo(this.Aircrafts[i].maxAmmo - this.Aircrafts[i].ammo);
            }
        }
        else
        {
            for (int i = 0; i < this.Aircrafts.length; i++) 
            {
                if(this.Aircrafts[i].isPriority() && this.ammo != 0)
                {
                    this.ammo -= this.Aircrafts[i].maxAmmo - this.Aircrafts[i].ammo;

                    this.Aircrafts[i].refillAmmo(this.Aircrafts[i].maxAmmo - this.Aircrafts[i].ammo);
                }
                else
                {
                    break;
                }
            }
            
            for (int i = 0; i < this.Aircrafts.length; i++) 
            {
                if(!this.Aircrafts[i].isPriority() && this.ammo != 0)
                {
                    this.ammo -= this.Aircrafts[i].maxAmmo - this.Aircrafts[i].ammo;

                    this.Aircrafts[i].refillAmmo(this.Aircrafts[i].maxAmmo - this.Aircrafts[i].ammo);
                }
                else
                {
                    break;
                }
            }
        }
    }

    public void fight(Carrier enemyCarrier)
    {
        int damage = 0;

        for (int i = 0; i < this.Aircrafts.length; i++) 
        {
            damage += this.Aircrafts[i].get_damage();
        }

        enemyCarrier.hp =- damage;
    }

    public int get_requiredAmmoToFill()
    {
        int requiredAmmo = 0;

        for (int i = 0; i < this.Aircrafts.length; i++) 
        {
            requiredAmmo += this.Aircrafts[i].maxAmmo - this.Aircrafts[i].ammo;  
        }

        return requiredAmmo;
    }

    public String getStatus()
    {
        String returnString = "";

        if(this.hp == 0)
        {
            return "It's dead Jim :(";
        }

        returnString +=  "HP: " + this.hp + ", Aircraft count: " + this.Aircrafts.length +  
        ", Ammo Storage: " + this.ammo + ", Total damage: " + this.get_TotalDamage();

        returnString += "\nAircrafts:";

        for (int i = 0; i < this.Aircrafts.length; i++) 
        {
            returnString += "\nType " + this.Aircrafts[i].type + ", Ammo: " + this.Aircrafts[i].ammo + 
            ", Base Damage: " + this.Aircrafts[i].baseDamage + ", All Damage: " + this.Aircrafts[i].get_damage();    
        }

        return returnString;
    }

    public int get_TotalDamage()
    {
        int totalDamage = 0;

        for(int i = 0; i < this.Aircrafts.length; i++)
        {
            totalDamage += this.Aircrafts[i].get_damage();
        }

        return totalDamage;
    }
}
