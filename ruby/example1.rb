result = Array.new

# Loop through all possible values of b < 1000
(1..999).each do |b|
  # Loop through all possible values of a < b
  (1..(b - 1)).each do |a|
    # Calculate the result of (a^2 + b^2 + 1)/(ab)
    calculated_result = (a.to_f**2 + b.to_f**2 + 1) / (a.to_f * b.to_f);
    # Check if the result is an integer by using modulus to see if there is a remainder
    result.push([a,b]) if calculated_result % 1 == 0
  end
end

puts "Result: #{result}"