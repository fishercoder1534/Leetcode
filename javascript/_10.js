
var isMatch = function (s, p) {
  return (new RegExp('^' + p + '$')).test(s)
}

console.log(isMatch('aa', 'a*'))
