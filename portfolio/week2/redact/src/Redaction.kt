// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

redact(first: String, second: String, third: Char="X"): String{
  return first.replace(second, third.toString().repeat(second.length))
}
