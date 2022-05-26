won_matches = 0
lost_matches = 0
total_matches = 0
command = input()

while command != "End of tournaments":
    name_of_tournament = command
    number_of_games = int(input())
    for i in range(1, number_of_games+1):
        total_matches += 1
        score_of_desi_team = int(input())
        score_of_enemy_team = int(input())
        difference = abs(score_of_enemy_team - score_of_desi_team)
        if score_of_desi_team > score_of_enemy_team:
            won_matches += 1
            print(f"Game {i} of tournament {name_of_tournament}: win with {difference} points.")
        elif score_of_desi_team < score_of_enemy_team:
            lost_matches += 1
            print(f"Game {i} of tournament {name_of_tournament}: lost with {difference} points.")
    command = input()

percent_won_matches = won_matches / total_matches * 100
percent_lost_matches = lost_matches / total_matches * 100
print(f"{percent_won_matches:.2f}% matches win")
print(f"{percent_lost_matches:.2f}% matches lost")
