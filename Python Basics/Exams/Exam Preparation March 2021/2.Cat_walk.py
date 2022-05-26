minutes_walking = int(input())
number_of_walks = int(input())
ingested_kcal_daily = int(input())

total_minutes_walking = minutes_walking * number_of_walks
burned_kcal = total_minutes_walking * 5

if burned_kcal >= ingested_kcal_daily / 2:
    print(f"Yes, the walk for your cat is enough. Burned calories per day: {burned_kcal}.")
else:
    print(f"No, the walk for your cat is not enough. Burned calories per day: {burned_kcal}.")
