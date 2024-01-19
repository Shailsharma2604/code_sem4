#include <iostream>
#include <vector>

using namespace std;

string canComplete(vector<int>& heights, int initial_energy) {
    int min_energy = initial_energy;
    int current_energy = initial_energy;

    for (int i = 1; i < heights.size(); ++i) {
        int diff = heights[i] - heights[i - 1];
        current_energy += diff;

        min_energy = min(min_energy, current_energy);

        if (min_energy < 0) {
            return "NO";
        }
    }

    return "YES";
}

int main() {
    int T;
    cin >> T;

    while (T--) {
        int N, X;
        cin >> N >> X;

        vector<int> heights(N);
        for (int i = 0; i < N; ++i) {
            cin >> heights[i];
        }

        string result = canComplete(heights, X);
        cout << result << endl;
    }

    return 0;
}
