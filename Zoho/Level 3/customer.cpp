#include "shop.cpp"

int main()
{
    int choice, loop = 1;
    while (loop)
    {
        // MensClothing shirtCopy = shop.shirt;
        std::cout << "***** BUY SOMETHING *****" << endl
                  << " 1. Shirt" << endl
                  << " 2. Pants" << endl
                  << " 3. Inners" << endl
                  << " 4. Close" << endl;
        std::cin >> choice;

        switch (choice)
        {
        case 1:
        {
            cout << "shirt" << endl << endl;
            continue;
        }

        case 4:
        {
            cout << "closing" << endl << endl;
            loop = 0;
            break;
        }

        default:
        {
            cout << "Cool" << endl << endl;
            break;
        }
        }
    }

    return 0;
}