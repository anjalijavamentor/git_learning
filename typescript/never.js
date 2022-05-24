function consolecode(msg, code) {
    throw { msg: msg, code: code };
}
console.log(consolecode("i want to run my code in console", 233));
