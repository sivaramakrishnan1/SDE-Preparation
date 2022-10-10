#include <iostream>
#include <fstream>
using namespace std;

int main()
{
    int x=0;
    string name;
    
    ofstream db("Database.txt", ios::app);

    for(;x < 5 ;)
    {
        getline(cin, name, '\n');
        db << name;
        x++;
    }

    db.close();
    return 0;
}