
year_type = input()     # leap / normal
number_of_holidays = float(input())
weekends_in_home_town = float(input())

all_weekends = 48
weekends_in_sofia = all_weekends - weekends_in_home_town
games_in_sofia = weekends_in_sofia * 3 / 4
games_in_home_town = weekends_in_home_town
holiday_games = number_of_holidays * 2 / 3
total_games = games_in_sofia + games_in_home_town + holiday_games

if year_type == "leap":
    total_games *= 1.15

print(int(total_games))
