from collections import defaultdict


class Graph:

    def __init__(self):
        # adjancy matrices
        self.graph = defaultdict(list)

    # add list dicitonary key is vertices value is list of adjencies
    def addEdge(self, v, a):

        self.graph[v].append(a)

    def bfs(self, start):

        # status of all vertices
        visited = [False] * len(self.graph)

        # queue of visited vertices
        queue = []

        # mark start vertices as visited
        queue.append(start)
        visited[start] = True

        # traverse 

        while queue:

            # dequeue vv = visited_vertex 
            vv = queue.pop()
            print (vv, end = '')

            for i in self.graph[vv]:

                if visited[i] == False:
                    queue.append(i)
                    visited[i] = True

        print("")


# Build Graph

g = Graph()
g.addEdge(0, 1)
g.addEdge(0, 2)
g.addEdge(1, 2)
g.addEdge(2, 0)
g.addEdge(2, 3)
g.addEdge(3, 3)

g.bfs(2)
