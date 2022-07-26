#include<iostream>
#include "MensClothing.h"

using namespace std;


MensClothing buyShirt(MensClothing shirt)
{
    int shirtSize, loop = 1;
    while (loop)
    {
        cout << "\n\t\t\tSHIRTS";       
        cout << endl
             << "\t-----------------------------------------"<< endl
             << "\t| 1. Small \t\t:" << shirt.smallStock() << " \t\t|" << endl
             << "\t| 2. Medium \t\t:" << shirt.medStock() << " \t\t|" << endl
             << "\t| 4. Large \t\t:" << shirt.largeStock() << " \t\t|" << endl
             << "\t| 5. X-Large \t\t:" << shirt.xlargeStock() << " \t\t|" << endl
             << "\t| Total stock\t\t:" << shirt.totalStock() << " \t\t|" << endl
             << "\t-----------------------------------------" << endl;
   
        cout << "Enter your choice: ";
        cin >> shirtSize;

        switch (shirtSize)
        {
        case 1:
        {
            shirt.buySmall();
            break;
        }
        case 2:
        {
            shirt.buyMed();
            break;
        }
        case 3:
        {
            shirt.buyLarge();
            break;
        }
        case 4:
        {
            shirt.buyXlarge();
            break;
        }
        default:
        {
            loop = 0;
            break;
        }
        }
    }

    return shirt;
}

MensClothing buyPants(MensClothing pants)
{
    int pantSize, loop = 1;

    while (loop)
    {
        cout << "\n\t\t\tPANTS";       
        cout << endl
             << "\t-----------------------------------------"<< endl
             << "\t| 1. Small \t\t:" << pants.smallStock() << " \t\t|" << endl
             << "\t| 2. Medium \t\t:" << pants.medStock() << " \t\t|" << endl
             << "\t| 4. Large \t\t:" << pants.largeStock() << " \t\t|" << endl
             << "\t| 5. X-Large \t\t:" << pants.xlargeStock() << " \t\t|" << endl
             << "\t| Total stock\t\t:" << pants.totalStock() << " \t\t|" << endl
             << "\t-----------------------------------------" << endl;
   
        cout << "Enter your choice: ";
        cin >> pantSize;

        switch (pantSize)
        {
        case 1:
        {
            pants.buySmall();
            break;
        }
        case 2:
        {
            pants.buyMed();
            break;
        }
        case 3:
        {
            pants.buyLarge();
            break;
        }
        case 4:
        {
            pants.buyXlarge();
            break;
        }
        default:
        {
            loop = 0;
            break;
        }
        }
    }
    
    return pants;
}

MensClothing buyInners(MensClothing inners)
{
    int innersSize, loop = 1;

    while (loop)
    {       
        cout << "\n\t\t\tINNERS";       
        cout << endl
             << "\t-----------------------------------------"<< endl
             << "\t| 1. Small \t\t:" << inners.smallStock() << " \t\t|" << endl
             << "\t| 2. Medium \t\t:" << inners.medStock() << " \t\t|" << endl
             << "\t| 4. Large \t\t:" << inners.largeStock() << " \t\t|" << endl
             << "\t| 5. X-Large \t\t:" << inners.xlargeStock() << " \t\t|" << endl
             << "\t| Total stock\t\t:" << inners.totalStock() << " \t\t|" << endl
             << "\t-----------------------------------------" << endl;

        cout << "Press anything other than 1 - 5 to exit \n Enter your choice: ";
        cin >> innersSize;

        switch (innersSize)
        {
            case 1:
            {
                inners.buySmall();
                break;
            }
            case 2:
            {
                inners.buyMed();
                break;
            }
            case 3:
            {
                inners.buyLarge();
                break;
            }
            case 4:
            {
                inners.buyXlarge();
                break;
            }
            default:
            {
                loop = 0;
                break;
            }
        }
    }

    return inners;
}

int main()
{
    MensClothing shirt(20, 20, 20, 20);
    MensClothing pants(20, 20, 20, 20);
    MensClothing inners(20, 20, 20, 20);


    bool loop = true;
    int choice;

    while (loop)
    {
        cout << "\n\t\t\tMAIN MENU";
        cout << endl << "**************************************************" << endl <<
        "S.No.\t Product| " << "Small\tMedium\tLarge\tXLarge " << endl <<
        "1. \t Shirt\t| " << shirt.smallStock() << "\t" << shirt.medStock() << "\t" << shirt.largeStock() << "\t" << shirt.xlargeStock() << endl <<
        "2. \t pants\t| " << pants.smallStock() << "\t" << pants.medStock() << "\t" << pants.largeStock() << "\t" << pants.xlargeStock() << endl <<
        "3. \t inners\t| " << inners.smallStock() << "\t" << inners.medStock() << "\t" << inners.largeStock() << "\t" << inners.xlargeStock() << endl <<
        "**************************************************" << endl;

        cout << "Enter your choice: ";
        cin >> choice;

        switch(choice)
        {
            case 1:
            {
                shirt = buyShirt(shirt);
                break;
            }

            case 2:
            {
                pants = buyPants(pants);
                break;
            }

            case 3:
            {
                inners = buyInners(inners);
                break;
            }

            default:
            {
                loop = false;
                break;
            }
        }
    }

    return 0;
}