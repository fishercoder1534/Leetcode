/**
 * Author: Phuong Lam
 */

/**
 * @param {number} length
 */
var SnapshotArray = function (length) {
  this.changes = {}
  this.snapShots = []
}

/**
 * @param {number} index
 * @param {number} val
 * @return {void}
 */
SnapshotArray.prototype.set = function (index, val) {
  this.changes[index] = val
}

/**
 * @return {number}
 */
SnapshotArray.prototype.snap = function () {
  this.snapShots.push(this.changes)
  this.changes = {}
  return this.snapShots.length - 1
}

/**
 * @param {number} index
 * @param {number} snap_id
 * @return {number}
 */
SnapshotArray.prototype.get = function (index, snap_id) {
  while (snap_id >= 0 && this.snapShots[snap_id][index] === undefined) snap_id--
  if (snap_id >= 0) return this.snapShots[snap_id][index]
  return 0
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * var obj = new SnapshotArray(length)
 * obj.set(index,val)
 * var param_2 = obj.snap()
 * var param_3 = obj.get(index,snap_id)
 */
