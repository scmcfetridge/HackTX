require_relative 'Sample'

class User
	def initialize(name, phoneNum)
		@name = name
		@phoneNum = phoneNum
		@alive = true
		@target = new User
		@score = 0
	end

	#change a users alive status to false
	def kill
		@alive = false
	end

	#set the new target user
	#param user is user to be the new targt
	#param addScore is the amount to add to the users score
	def setTargetUser(user, addScore)
		@target = user
		@score += addScore
	end

	def sendNewTarget
		#send text with the new target name
	end




