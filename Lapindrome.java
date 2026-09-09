#include <bits/stdc++.h>
using namespace std;

int main() {
    int T;
    cin >> T;

    while (T--) {
        string s;
        cin >> s;

        int n = s.length();
        int mid = n / 2;

        int left[26] = {0};
        int right[26] = {0};

       
        for (int i = 0; i < mid; i++) {
            left[s[i] - 'a']++;
        }

        
        for (int i = (n + 1) / 2; i < n; i++) {
            right[s[i] - 'a']++;
        }

        bool lapindrome = true;

        for (int i = 0; i < 26; i++) {
            if (left[i] != right[i]) {
                lapindrome = false;
                break;
            }
        }

        if (lapindrome)
            cout << "YES\n";
        else
            cout << "NO\n";
    }

    return 0;
}
