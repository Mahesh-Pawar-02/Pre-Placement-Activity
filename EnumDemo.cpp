#include<iostream>
using namespace std;

int main()
{
    enum days {Sunday, Monday, Tuesday, Wednesday};

    cout<<Sunday<<"\n";
    cout<<Monday<<"\n";
    
    enum Months {January = 10, February = 20, March};

    cout<<January<<"\n";
    cout<<February<<"\n";
    cout<<March<<"\n";
    
    return 0;
}

/*

&   Bitwise and
|   Bitwise Or
^   Bitwise Xor
~   Bitwise Tilda
<<  Bitwise Left shift
>>  Bitwise Right shift

*/