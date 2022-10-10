#include <bits/stdc++.h>
#include <string.h>
#include <vector>
using namespace std;

struct files
{
    string fileName;
    string fileContent;
};

struct directory
{
    char directoryName[20];
    directory* parent;
    vector<directory *> subfolders;
    vector<files *> file;
};

void listAllContents(directory **folder)
{
    if ((*folder)->subfolders.size() == 0)
    {
        cout << "Empty directory";
        return;
    }

    for (int i = 0; i < (*folder)->subfolders.size(); i++)
    {
        string folderName = (*folder)->subfolders[i]->directoryName;
        cout << "\\" << folderName << " ";
    }
}

void createDirectory(directory **folder)
{
    directory *node = new directory;

    cout << "Enter the directory name : ";

    cin >> node->directoryName;
    node->parent = *folder;

    (*folder)->subfolders.push_back(node);
}

void moveToFolder(directory **folder)
{
    cout << endl << "Enter folder name to move : "
    string folderName;
    cin >> folderName;
    for(int i = 0 ; i < (*folder)->subfolders.size ; i++)
    {
        if(strcmp(((*folder)->subfolders[i])->directoryName , folderName) == 0)
    }
}


int main()
{
    directory *root = new directory();
    directory *currentDirectory = root;

    while (1)
    {
        cout << endl
             << "1. List all contents " << endl
             << "2. Go to parent folder" << endl
             << "3. Move to folder" << endl
             << "4. Create directory" << endl
             << "5. Create file" << endl
             << "6. Print file contents" << endl;
        int choice;
        cin >> choice;

        switch (choice)
        {
        case 1:
        {
            listAllContents(&currentDirectory);
            break;
        }

        case 2:
        {
            if(currentDirectory->parent == NULL)
            {
                cout << "NO Parent folder found. Moved to root folder";
                currentDirectory = root;
                break;
            }
            currentDirectory = currentDirectory->parent;
            cout << "Moved to parent folder";
            break;
        }

        case 3:
        {
            moveToFolder(&currentDirectory)
        }

        case 4:
        {
            createDirectory(&currentDirectory);
            break;
        }

        default:
        {
            delete root;
            return 0;
        }
        }
    }
    return 0;
}