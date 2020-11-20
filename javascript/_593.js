/**
 * @param {number[]} p1
 * @param {number[]} p2
 * @param {number[]} p3
 * @param {number[]} p4
 * @return {boolean}
 */

//     const d12 = distanceSquare(p1, p2)
//     const d13 = distanceSquare(p1, p3)
//     const d14 = distanceSquare(p1, p4)
//     const d23 = distanceSquare(p2, p3)
//     const d24 = distanceSquare(p2, p4)
//     const d34 = distanceSquare(p3, p4)

//     if (d12 === 0 || d13 === 0 || d14 === 0) return false

//     // 1  2
//     // 3  4
//     if (d12 === d13 && d12 + d13 === d14 && d23 === d24 + d34) return true

//     // 1  2
//     // 4  3
//     if (d12 === d14 && d12 + d14 === d13 && d24 === d34 + d23) return true

//     // 1  3
//     // 4  2
//     if (d13 === d14 && d13 + d14 === d12 && d34 === d23 + d24) return true

var validSquare = function (p1, p2, p3, p4) {
  function distanceSquare(a, b) {
    return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1])
  }

  const ds = [distanceSquare(p1, p2), distanceSquare(p1, p3), distanceSquare(p1, p4), distanceSquare(p2, p3), distanceSquare(p2, p4), distanceSquare(p3, p4)].sort((a, b) => a - b)

  for (var i = 0; i < 3; i++) if (ds[i] !== ds[i + 1] || ds[i] === 0) return false

  if (ds[4] === ds[5] && ds[4] === ds[0] * 2) return true

  return false
}
