// Author: Phuong Lam

/**
 * @param {number[][]} points
 * @return {number}
 */
var maxWidthOfVerticalArea = function(points) {
    const sortedX = points
        .map((point) => {
            return point[0]
        })
        .sort((a, b) => {
            if (a < b) return -1
            if (a > b) return 1
            return 0
        })
    var max = 0
    for (let i = 0; i < sortedX.length - 1; i++) {
        const d = sortedX[i + 1] - sortedX[i]
        if (d > max) max = d
    }
    return max
};