#include<iostream>
namespace Marvellous
{
    void Display()
    {
        std::cout<<"Inside Display of Marvellous\n";
    }
}
namespace Infosystems
{
    void Display()
    {
        std::cout<<"Inside Display of Infosystems\n";
    }  
}
int main()
{
    Marvellous::Display();
    Infosystems::Display();

    return 0;
}