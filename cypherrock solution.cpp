#include <bits/stdc++.h>
using namespace std;
#define ll long long

ll eq(ll a,ll b,ll c)
{
    return b+c*a; //generating equation which is actually Y.
}

int main()
{
    string str;
    cin>>str;//taking input 
    vector<vector<pair<int,int>>>v(4,vector<pair<int,int>>(str.size()));//making vector pair to store co-ordinates as pair.
    for(int i=0;i<str.size();i++)
    {
        ll a1=rand()%100;
		ll o=str[i];
        for(int j=0;j<4;j++)
        {
            ll x=rand()%100;//using random function for x
            ll y=eq(x,o,a1);//calling function for equation
            v[j][i]={x,y};//storing co-ordinates for each char
        }
    }
    string secret;
    for(int i=0;i<str.size();i++)
    {
        ll x0=v[1][i].first;
		ll x1=v[2][i].first;
		ll y0=v[1][i].second;
		ll y1=v[2][i].second;
        secret+=char(((y1*x0)-(y0*x1))/(x0-x1));//creation of secret using langrage interpolation.
    }
    cout<<secret;
}

